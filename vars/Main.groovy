#!/usr/bin/env groovy

def install() {
  script{
    sh 'npm install'
  }
}
def test() {
  script{
    sh 'npm run test'
  }
}