def call() {
  steps.echo "Hello"
  steps.echo "Welcome" > new.txt
  steps.cat new.txt
}
