import java.io.File

object Main {
	@JvmStatic
	fun main(vararg arguments: String) {
		println("Hello from Kotlin!")

		System.load(File("target/debug/libtest.so").absolutePath)

		rustMain()
	}

	private external fun rustMain()
}