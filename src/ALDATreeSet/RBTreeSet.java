package ALDATreeSet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Mirella Isabel Diaz Johansson mijo1919
 * @author Oskar Lundborg oslu6451
 */

public class RBTreeSet<T extends Comparable<T>> implements Set<T> {

    private static final int RED = 0;
    private static final int BLACK = 1;

    private Node<T> root;
    private Node<T> smallest;
    private Node<T> largest;

    private int size;

    private void insert(T data){
        Node<T> node = root;
        Node<T> parent = null;
        Node<T> grandparent = null;
    }

    private Node<T> getParent(Node<T> node){
        return root; //Temp
    }

    private boolean isLeftChild(Node<T> node){
        return false; //Temp
    }

    private void fixColorsAfterAdd(Node<T> node){

    }

    private void fixColorsAfterRemove(Node<T> node){

    }

    private Node<T> findSmallest(Node<T> node){
        return root; //Temp
    }

    private Node<T> findLargest(Node<T> node){
        return root; //Temp
    }


    //Set metoder
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
