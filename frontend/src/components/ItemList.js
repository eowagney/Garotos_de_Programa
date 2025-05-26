function ItemList({ items, onUpdate, onDelete }) {
    return (
      <ul className="space-y-2">
        {items.map(item => (
          <li key={item._id} className="flex justify-between items-center border p-2 rounded">
            <input 
              value={item.name} 
              onChange={e => onUpdate(item._id, { name: e.target.value })} 
              className="border p-1 rounded w-full mr-2"
            />
            <button onClick={() => onDelete(item._id)} className="bg-red-500 text-white p-1 rounded">
              Delete
            </button>
          </li>
        ))}
      </ul>
    );
  }
  
  export default ItemList;

  