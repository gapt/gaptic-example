import at.logic.gapt.expr._
import at.logic.gapt.proofs.{Context, Sequent}
import at.logic.gapt.proofs.gaptic._

object example extends TacticsProof {
  ctx += Context.Sort("i")
  ctx += hoc"P: i>o"
  ctx += hoc"Q: i>o"

  val lemma = Lemma(
    ("a" -> fof"P a") +:
    ("b" -> fof"∀x (P x ⊃ Q x)") +:
    Sequent()
    :+ ("c" -> fof"Q a")
  ) {
    chain("b")
    chain("a")
  }
}