def call () {
	pipeline{
		stage ('check feature_branch'){
			steps{
				script{
					println 'test'
				}
			}
		}
	
	}
}
