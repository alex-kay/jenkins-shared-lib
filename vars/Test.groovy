#!/usr/bin/env groovy
def call() {
  script{
    sh 'npm run test'
}
}
