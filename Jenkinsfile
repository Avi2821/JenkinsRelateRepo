pipeline {
  agent any
  stages {
    stage('Dev build') {
      steps {
        echo 'Pull the code from git'
      }
    }

    stage('Unit Testing') {
      steps {
        echo 'Testing for smoke'
      }
    }

    stage('Deploy in QA') {
      steps {
        echo 'down the QA environment'
        echo 'Host the build in QA'
        echo 'Start the server'
      }
    }

    stage('Integration Testing') {
      parallel {
        stage('Integration Testing') {
          steps {
            echo 'Testing QA for integration'
          }
        }

        stage('API testing') {
          steps {
            echo 'Testing the QA for API'
          }
        }

        stage('Performance Testing') {
          steps {
            echo 'Testing QA for performance'
          }
        }

      }
    }

    stage('Varification') {
      steps {
        echo 'Testing completed'
      }
    }

    stage('Send Mail') {
      steps {
        echo 'Sending mail to configured mail'
      }
    }

  }
}