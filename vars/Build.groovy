#!/usr/bin/env groovy
def call() {
  withCredentials([usernamePassword(credentialsId: 'github_key', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
    sh('git tag -a "${BUILD_NUMBER}" -m "Added build tag"')
    sh('git push --tags')
}
            sh '''
            npm run build
            git tag build-${BUILD_NUMBER}
            git push --tags
            '''
}

