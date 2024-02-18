pipeline{
	agent any
	
	environment{
		DOCKER_IMAGE_NAME='calculator'
		GITHUB_REPO_URL=
	}
	
	stages{
		stage(Checkout'){
			steps{
				script{
					git branch: 'master', url: "${GITHUB_REPO_URL}"
				}
			}
		}
		
		stage('Build Docker Image'){
			steps{
				script{
					docker.build("${DOCKER_IMAGE_NAME}",'.')
				}
			}
		}
		
		stage('Push Docker Images'){
			steps{
				script{
					docker.withRegistry('', 'DockerHub') {
						sh 'docker tag calculator souvikiiitb/calculator:latest'
						sh 'docker push souvikiiitb/calculator'
					}
				}
			}
		}
	}
}							
