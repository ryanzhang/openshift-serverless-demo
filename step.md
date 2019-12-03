# 1 serverless app from console

git: https://github.com/ryanzhang/openshift-knative-application
ref: polish-style  
context: go

# 2 Rev management

rev1: origin
rev2: bold version

do one more build
do two service edit -> two revision, remove unused rev

# 3 scalable ability from zero to many
rev3 -> handling 100% traffic

spec->template->annotations:
autoscaling.knative.dev/target: "10"

hey -c 150 -z 10s http://hello.lenovo-knative.apps.cluster-beijing-8203.beijing-8203.example.opentlc.com/

# 4 teckton build pipeline
Flexible and cloudnative level apps pipeline to provision FaaS, SaaS
k apply -f pipeline-sa-role.yaml 
k apply -f build-resources.yaml
k apply -f build-app-task.yaml
k apply -f kn-deploy-task.yaml
k apply -f kn-sv-deploy-pipeline.yaml

# 5 camel-k Function as a service
kubectl create -f messages-channel.yaml
kubectl create -f words-channel.yaml

kamel install
kamel run printer.groovy
kamel run splitter.groovy
kamel run feed.groovy


Playing hard
