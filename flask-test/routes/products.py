from flask import Blueprint, render_template, request

products = [
    {
        "id": 1,
        "name": "Gaming Mouse",
        "price": 29.99,
        "image_url": "https://via.placeholder.com/300x200?text=Mouse",
        "short_description": "High precision RGB gaming mouse",
        "full_description": "A high‑performance gaming mouse with 7 programmable buttons."
    },
    {
        "id": 2,
        "name": "Mechanical Keyboard",
        "price": 79.99,
        "image_url": "https://via.placeholder.com/300x200?text=Keyboard",
        "short_description": "Blue switch mechanical keyboard",
        "full_description": "Durable keyboard with blue switches, perfect for typing and gaming."
    }
]

products_bp = Blueprint('products', __name__)

def find_product(pid):
    for p in products:
        if p["id"] == pid:
            return p
    return None

@products_bp.route('/')
def index():
    product_id = request.args.get('product_id', type=int)
    selected = find_product(product_id)

    return render_template(
        'template-jc-products.html',
        products=products,
        selected_product=selected
    )
