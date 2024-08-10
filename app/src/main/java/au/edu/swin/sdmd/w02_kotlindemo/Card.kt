class Card(val rank: String, val suit: String, var flip: Boolean = true) {

    // Toggle the flip value
    fun flip() {
        flip = !flip
    }

    // Print the card's details based on the flip value
    fun printDetails() {
        if (flip) {
            println("Rank: $rank, Suit: $suit")
        } else {
            println("----")
        }
    }
}
