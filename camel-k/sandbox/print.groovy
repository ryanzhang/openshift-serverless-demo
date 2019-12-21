from('knative:channel/words')
  .log('Sending ${body} to slack')
  .to('slack:#serverless')

camel {
  components {
     slack {
       webhookUrl 'https://hooks.slack.com/services/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'
       }
   }
 }

