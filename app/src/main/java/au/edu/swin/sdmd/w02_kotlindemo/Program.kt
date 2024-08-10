fun main() {
    // Create a Card object with rank ACE and suit HEARTS
    val card = Card(rank = "ACE", suit = "HEARTS")

    // Print card's details
    card.printDetails()

    // Flip the card
    card.flip()

    // Print the card's details again
    card.printDetails()
}
