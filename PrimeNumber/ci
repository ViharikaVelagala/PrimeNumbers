#!/bin/bash

export env=$1
export version=$2
JAR_NAME=/jar:/home/travis/build/ViharikaVelagala/PrimeNumbers/target/PrimeNumber.jar
CLASS_NAME="com.example.prime. PrimeNumber"

if [ ${env} = "dev" ] || [ ${env} = "staging" ] || [ ${env} = "prod" ]; then 
    java -cp ${JAR_NAME} ${CLASS_NAME} 6    
else 
    echo "Invalid Environment"
	exit 1
fi
