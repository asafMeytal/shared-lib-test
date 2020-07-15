def call () {
	pipeline{
		stages{
			stage('Test feature branch'){
				steps{
					echo 'test'
				}
			}
		}
	}
}
