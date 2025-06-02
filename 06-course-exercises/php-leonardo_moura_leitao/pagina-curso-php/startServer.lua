-- start server lamp
os.execute("docker run -p '80:80' -v $(pwd)/app:/var/www/html php:7.4.30-apache")
