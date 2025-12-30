from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

products = []


@app.route('/')
def index():
    product_id = request.args.get('product_id', type=int)
    selected = None

    if product_id is not None:
        selected = find_product(product_id)

    return render_template(
        'template-jc-products.html',
        products=products,
        selected_product=selected
    )

def find_product(pid):
    for p in products:
        if p['id'] == pid: return p
    return None

@app.route('/add', methods=['POST'])
def add_product():
    new_id = len(products) + 1
    product = Product(
        id=new_id,
        name=request.form['name'],
        price=float(request.form['price']),
        image_url=request.form['image_url'],
        short_description=request.form.get('short_description', ''),
        full_description=request.form.get('full_description', '')
    )

    products.append(product)
    return redirect(url_for('index'))


@app.route('/product/<int:product_id>')
def product_details(product_id):
    product = find_product(product_id)

    return render_template(
        'template-jc-products.html',
        products=products,
        selected_product=product
    )