def call(BUILD_URL,JOB_NAME,BUILD_NUMBER,BUILD_STATUS)
{
  post {
        always {
            emailext body: '''Environment:       Production
Build URL:          $BUILD_URL
Project:              $JOB_NAME
Build Number:     $BUILD_NUMBER
Build Result:       $BUILD_STATUS
''', subject: 'Notification', to: 'coolpavi193@gmail.com'
        }
    }

}
