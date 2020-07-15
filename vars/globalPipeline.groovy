def call(){
	pipeline{
		stage ('check feature_branch'){
			steps{
				echo 'echo test'
			}
		}
	
	}
}
