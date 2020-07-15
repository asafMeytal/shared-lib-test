def call () 
{
	node{
		stage ('Test feature branch'){
			if (env.BRANCH_NAME =~ 'PR*'){
				checkout scm
				echo 'test ok for PR worked'
			}					
		}
		
		stage ('Merge to Develop branch'){
			if (env.BRANCH_NAME == 'develop'){

			}
		}
	}
}
