import { useState, useEffect } from 'react';
import axios from 'axios';
import ItemForm from './components/ItemForm';
import ItemList from './components/ItemList';

function App() {
  const [items, setItems] = useState([]);

  const fetchItems = async () => {
    const res = await axios.get('http://localhost:5000/items');
    setItems(res.data);
  };

  useEffect(() => { fetchItems(); }, []);

  const addItem = async (item) => {
    const res = await axios.post('http://localhost:5000/items', item);
    setItems([...items, res.data]);
  };

  const updateItem = async (id, newItem) => {
    const res = await axios.put(`http://localhost:5000/items/${id}`, newItem);
    setItems(items.map(item => item._id === id ? res.data : item));
  };

  const deleteItem = async (id) => {
    await axios.delete(`http://localhost:5000/items/${id}`);
    setItems(items.filter(item => item._id !== id));
  };

  return (
    <div className="max-w-md mx-auto p-4">
      <h1 className="text-2xl font-bold mb-4">CRUD App</h1>
      <ItemForm onAdd={addItem} />
      <ItemList items={items} onUpdate={updateItem} onDelete={deleteItem} />
    </div>
  );
}

export default App;
