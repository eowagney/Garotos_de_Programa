import { useState } from 'react';

function ItemForm({ onAdd }) {
  const [name, setName] = useState('');

  const handleSubmit = e => {
    e.preventDefault();
    onAdd({ name });
    setName('');
  };

  return (
    <form onSubmit={handleSubmit} className="flex space-x-2 mb-4">
      <input value={name} onChange={e => setName(e.target.value)} 
             className="border p-2 rounded" placeholder="New item" />
      <button type="submit" className="bg-blue-500 text-white p-2 rounded">Add</button>
    </form>
  );
}

export default ItemForm;
