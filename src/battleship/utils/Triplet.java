package battleship.utils;

import java.util.Objects;

/**
 * tuple containing 3 generic type elements
 *
 * @param <U> left
 * @param <K> middle
 * @param <V> right
 */
public class Triplet<U, K, V> {

    private final U left;
    private final K middle;
    private final V right;

    public Triplet(U left, K middle, V right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public Triplet(Pair<U, K> pair, V right) {
        this(pair.getLeft(), pair.getRight(), right);
    }

    public U getLeft() {
        return left;
    }

    public K getMiddle() {
        return middle;
    }

    public V getRight() {
        return right;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triplet<?, ?, ?> other = (Triplet<?, ?, ?>) obj;
        return this.left.equals(other.getLeft()) && this.middle.equals(other.getMiddle()) && this.right.equals(other.getRight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, middle, right);
    }
    
    @Override
    public String toString() {
    	return "(" + left + ", " + middle + ", " + right + ")";
    }
}
