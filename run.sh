#!/bin/bash

# Компіляція всіх Java файлів
javac src/*.java

# Запуск програми з правильним classpath
java -cp src RestaurantDemo