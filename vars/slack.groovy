#!/usr/bin/env groovy

def call() {
slackSend channel: '#devops', message: "jenkins status Build_URL : ${env.BUILD_URL} \n Job_Name : ${env.JOB_NAME}\n  Build_Number: ${env.BUILD_NUMBER} \n BuilD_status: ${env.BUILD_STATUS}"
}
