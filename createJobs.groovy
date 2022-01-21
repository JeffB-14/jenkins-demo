pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/JeffB-14/theme_park_rides.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
pipelineJob('theme-park-job-maven') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/JeffB-14/theme_park_rides-maven.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}