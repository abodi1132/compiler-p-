from flask import Blueprint, render_template
from routes.products import find_product, products

details_bp = Blueprint('product_details', __name__)

@details_bp.route('/product/<int:product_id>')
def product_details(product_id):
    product = find_product(product_id)

    return render_template(
        'template-jc-products.html',
        products=products,
        selected_product=product
    )