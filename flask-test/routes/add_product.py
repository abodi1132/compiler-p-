from flask import Blueprint, request, redirect, url_for
from routes.products import products

add_bp = Blueprint('add_product', __name__)

@add_bp.route('/add', methods=['POST'])
def add_product():
    new_id = products[-1]["id"] + 1

    product = {
        "id": new_id,
        "name": request.form["name"],
        "price": float(request.form["price"]),
        "image_url": request.form["image_url"],
        "short_description": request.form.get("short_description", ""),
        "full_description": request.form.get("full_description", "")
    }

    products.append(product)
    return redirect(url_for('products.index'))
