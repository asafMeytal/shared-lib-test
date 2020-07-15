def call () 
{
	node{
		stage ('Test feature branch'){
			if (env.BRANCH_NAME =~ 'PR*'){
				echo 'test ok for PR worked'
			}				
			
		}
	}
}
