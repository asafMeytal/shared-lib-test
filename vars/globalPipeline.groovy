def call () {
	pipeline{
		stages{

			stage ('Test feature branch'){
				steps{
						script{
							echo 'test'
						}
					}
				}
			}
		}
	}
}
