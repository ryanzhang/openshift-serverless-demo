# 1
git: https://github.com/ryanzhang/openshift-demo-application

ref: color_greeting  
context: java/quarkus

     43       - name: MAVEN_MIRROR_URL
     44         value: http://nexus.default.svc:8081/nexus/content/groups/public

# 2 Rev management

do one more build
do two service edit -> two revision, remove unused rev

# 3 scalable ability from zero to many
spec->template->annotations:
autoscaling.knative.dev/target: "10"

hey -c 150 -z 10s http://hello.lenovo-knative.apps.cluster-beijing-8203.beijing-8203.example.opentlc.com/

# 4 teckton build pipeline
```
Flexible and cloudnative level apps pipeline to provision FaaS, SaaS
k apply -f pipeline-sa-role.yaml 
k apply -f build-resources.yaml
k apply -f build-app-task.yaml
k apply -f kn-deploy-task.yaml
k apply -f kn-sv-deploy-pipeline.yaml

tkn pipeline start kn-svc-deploy
```
# 5 camel-k Function as a service
```
kubectl create -f messages-channel.yaml
kubectl create -f words-channel.yaml

kamel install

print.groovy
from('knative:channel/words')
  .to('log:info')
  .to('slack:#serverless')

split.groovy
from('knative:channel/messages')
  .split().tokenize(" ")
  .log('sending ${body} to words channel')
  .to('knative:channel/words')

input.groovy
//from('telegram:bots?authorizationToken=YourOwnAuthCode')
from('timer:clock?period=3s')

	.setBody().constant("Hello World from Camel K")
	.to('knative:channel/messages')
	.log('sent message to messages channel')

stern print -c integration
```

