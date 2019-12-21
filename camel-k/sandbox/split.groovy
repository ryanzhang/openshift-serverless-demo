from("knative:channel/messages")
  .split().tokenize(" ")
  .to("knative:channel/words")
