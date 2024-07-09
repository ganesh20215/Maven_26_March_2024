pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build World'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy World'
            }
        }
        stage('Test') {
            steps {
                echo 'Test World'
            }
        }
		stage('Report') {
            steps {
                echo 'Result Report Genrationa'
            }
        }
    }
	post
	{
		always
		{
			emailext body: 'Summary', subject: 'Pipeline Status', to: 'ganesh20215@gmail.com'
		}
	}
}
