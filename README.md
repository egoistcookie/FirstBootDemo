1、项目为springboot项目，本地启动后，可通过postman测试：
  添加商品：发送 POST 请求到 http://localhost:8080/products，请求体为 JSON 格式的商品信息，例如：
  {
      "name": "iPhone 15",
      "price": 999.99
  }
  获取所有商品：发送 GET 请求到 http://localhost:8080/products
  根据 ID 获取商品：发送 GET 请求到 http://localhost:8080/products/{id}，将 {id} 替换为实际的商品 ID。
  更新商品信息：发送 PUT 请求到 http://localhost:8080/products/{id}，请求体为更新后的商品信息。
  删除商品：发送 DELETE 请求到 http://localhost:8080/products/{id}
  20250204完成各功能测试；

2、
