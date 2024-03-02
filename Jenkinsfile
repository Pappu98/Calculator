pipeline{
	agent any
	
	environment{
		DOCKER_IMAGE_NAME='calculator'
		GITHUB_REPO_URL='https://github.com/Pappu98/Calculator.git'
	}
	
	stages{
		stage('Checkout'){
			steps{
				script{
					git branch: 'master', url: "${GITHUB_REPO_URL}"
				}
			}
		}

		stage('Build and test') {
			steps {
				script {
					sh 'mvn clean package'
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
		
               stage('Run Ansible playbook') {
              		steps {
        			script {
          				ansiblePlaybook(
				            playbook: 'deploy.yaml',
				            inventory: 'inventory'
          				)
        			}
      			}
    		}
	}
}							
