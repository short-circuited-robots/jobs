pipelineJob("test3") {
	description()
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
				git {
					remote {
						github("devblueray/JenkinsProjectTest", "https")
					}
					branch("*/master")
				}
			}
			scriptPath("Jenkinsfile")
		}
	}
	disabled(false)
}