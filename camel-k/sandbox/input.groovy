from('telegram:bots?authorizationToken=1022365814:AAHoM4z0Shz3x7Fiivn6Namz2n0i2pcKieM')
  .convertBodyTo(String.class)
  .to("knative:channel/messages")
