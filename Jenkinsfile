pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/eugeniacotrim/pracProject_BDD.git'
                
                // to run on some other branch
	              git branch: 'main', url: 'https://github.com/eugeniacotrim/pracProject_BDD.git'

            }
        }

        stage('Test') {
            steps {
                // To run Maven on a Windows agent, use
                bat "mvn clean test"
            }
            
            post {
                always {
                    cucumber '**/cucumber.json'
                }
            }

        }
    }
}
