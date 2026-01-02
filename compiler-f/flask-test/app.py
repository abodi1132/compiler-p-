from flask import Flask
from routes.products import products_bp
from routes.add_product import add_bp
from routes.product_details import details_bp

app = Flask(__name__)

# Register blueprints
app.register_blueprint(products_bp)
app.register_blueprint(add_bp)
app.register_blueprint(details_bp)

if __name__ == "__main__":
    app.run(debug=True)