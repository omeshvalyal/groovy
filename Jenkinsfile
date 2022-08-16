@Library('DemoLibrary') _
pipeline {
	agent any
	stages	{
		stage('Hello World') {
			steps{
				script {
					helloworld.hello()
					}
				}
			}
			 stage('Checkout code from Git') {
            steps {
                script 
                {
                    checkout_git.checkout_git()
                }
            }
		}
				stage('job trggering using aws codebuild'){
					steps {
						script {
							awstrigger.awstrigg()
						}
					}
				}
	}
}