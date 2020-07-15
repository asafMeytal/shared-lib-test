def call () 
{
	node{
		stage ('Test feature branch'){
			if (env.BRANCH_NAME =~ 'feature/*'){
				echo 'test ok'
			}				
			
		}
	}
}
