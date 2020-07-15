def call () 
{
	node{
		stage ('Test feature branch'){
				sh 'echo test'
			}
		}
		
	}
}
