object Q_01 {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def main(args: Array[String]): Unit = {
    printf("Enter a string with uppercase letters : ")
    val text = scala.io.StdIn.readLine()

    printf("Enter the key : ")
    val key = scala.io.StdIn.readInt()

    val encryptedText = cipher(encrypt, text, key, alphabet)
    val decryptedText = cipher(decrypt, encryptedText, key, alphabet)

    printf("Encrypted Text : %s\n", encryptedText)
    printf("Decrypted Text : %s\n", decryptedText)
  }


  val encrypt = (character: Char, key: Int, alphabet: String) =>
    alphabet((alphabet.indexOf(character.toUpper) + key) % alphabet.size)


  val decrypt = (character: Char, key: Int, str: String) => encrypt(character, -key, str)

  
  val cipher =
  (
    encryptORdecrypt: (Char, Int, String) => Char,
    text: String,
    key: Int,
    alphabet: String
  ) => text.map(encryptORdecrypt(_, key, alphabet))
}
