object CaesarCipher {
  val alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
  val key = 3

  def main(args: Array[String]): Unit = {
    val cipherText = cipher(encrypt, "Caesar Cipher", key, alphabet)
    val plainText = cipher(decrypt, cipherText, key, alphabet)

    printf("Cipher Text : %s\n", cipherText)
    printf("Plain Text : %s\n", plainText)
  }

  val encrypt = (c: Char, key: Int, alphabet: String) =>
    alphabet((alphabet.indexOf(c.toUpper) + key) % alphabet.size)

  val decrypt = (c: Char, key: Int, str: String) => encrypt(c, -key, str)

  val cipher = (func: (Char, Int, String) => Char, text: String, key: Int, alphabet: String) => text.map(func(_, key, alphabet))
}
