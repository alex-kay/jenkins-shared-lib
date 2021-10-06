#!/usr/bin/env groovy

def call() {
  parallel(
    a: {
        sh 'ping -c 3 instagram.com'
    },
    b: {
        sh 'ping -c 3 vk.com'
    },
    c: {
        sh 'ping -c 3 facebook.com'
    }
)
}
