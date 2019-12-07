# 1 serverless app from console
Point:
  * seemless developer experiences 
  * Build from git sources to serverless, outofbox 
  * WYSIWYG
git: https://github.com/ryanzhang/openshift-knative-application
ref: polish-style  
context: go

# 2 Rev management
Point:
  * totoally solution for traffic splitting
  * completed solution for b/g deployment canary deployment
  * friendly ui in develop portal

rev1: origin
rev2: bold version

do one more build
do two service edit -> two revision, remove unused rev

# 3 scalable ability from zero to many
Point:
  * outofbox metric(autoscaler metrics), monitoring solutions
  * resource effeciency and bust handling, autoscaling
  * 
rev3 -> handling 100% traffic

spec->template->annotations:
autoscaling.knative.dev/target: "10"

hey -c 150 -z 10s http://hello.lenovo-knative.apps.cluster-beijing-8203.beijing-8203.example.opentlc.com/

# 4 teckton build pipeline
Flexible and cloudnative level apps pipeline to provision FaaS, SaaS 


# 5 camel-k Function as a service

# 6 kiali video
Fancy video, observisibility
