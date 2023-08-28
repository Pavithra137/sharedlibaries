def call() {
 sh """
 ls
 mkdir new
 echo "hello" > 1.txt
 cat 1.txt
 """
}
