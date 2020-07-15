def call () 
{
	node{
		stage ('Test feature branch'){
			if (env.BRANCH_NAME =~ 'PR*'){
				checkout scm
				echo 'running tests....'
				echo 'PR is safe to merge into develop!'
			}					
		}
		
		stage ('Merge to Develop branch'){
			if (env.BRANCH_NAME == 'develop'){
				checkout scm
				sh 'git checkout -b release/0.1.0' //need to check on convention
				sh 'git push --set-upstream origin release/0.1.0'
				echo 'new release branch created'
			}
		}
		stage ('Promote Release'){
			if (env.BRANCH_NAME =~ 'release*'){
				checkout scm
				sh 'git checkout master'
				sh "git merge {$env.BRANCH_NAME}"
				sh 'git tag -a "v/0.1.0" -m "Merged release branch: "{$env.BRANCH_NAME}" HEAD'
				sh 'git push'
				sh 'git push origin tag v/0.1.0'
				sh "git push origin --delete ${release_branch}"
			}
		}
	}
}
