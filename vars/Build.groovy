#!/usr/bin/env groovy
def call() {
  withCredentials([usernamePassword(credentialsId: 'github_key', usernameVariable: 'GIT_USERNAME', passwordVariable: 'GITHUB_ACCESS_TOKEN')]) {
    sh('git tag -a "${BUILD_NUMBER}" -m "Added build tag"')
    sh('git push https://${GITHUB_ACCESS_TOKEN}@github.com/alex-kay/jenkins-homework.git --tags')
}
            sh '''
            npm run build
            git tag build-${BUILD_NUMBER}
            git push --tags
            '''
}

