#!/usr/bin/env groovy

def call() {
stage('Checkout') {
    echo "Source code checkout"
    def stagename='Checkout'
    echo "$stagename is completed"
    influxDbPublisher(selectedTarget: 'TestDB', customData: 'checkout')
}
}
