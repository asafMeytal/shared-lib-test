def call () {
	pipeline{
		stages ('check feature_branch'){
			steps{
				echo 'test'
			}
		}
	
	}
}
