def call(){
	pipeline{
		stage ('check feature_branch'){
			steps{
				sh 'test'
			}
		}
	
	}
}
