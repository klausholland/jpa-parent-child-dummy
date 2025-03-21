CREATE TABLE parent (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL
);

CREATE TABLE child (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    active BOOLEAN NOT NULL DEFAULT FALSE,
    pending BOOLEAN NOT NULL DEFAULT FALSE,
    parent_id UUID NOT NULL,
    type VARCHAR(255) NOT NULL,
    CONSTRAINT fk_child_parent FOREIGN KEY (parent_id) REFERENCES parent (id) ON DELETE CASCADE
);

INSERT INTO parent (id, name) VALUES ('550e8400-e29b-41d4-a716-446655440000', 'Test Parent');

INSERT INTO child (id, name, active, pending, parent_id, type) VALUES
('550e8400-e29b-41d4-a716-446655440001', 'Test Child 1', TRUE, FALSE, '550e8400-e29b-41d4-a716-446655440000', 'TYPE_A'),
('550e8400-e29b-41d4-a716-446655440002', 'Test Child 2', FALSE, TRUE, '550e8400-e29b-41d4-a716-446655440000', 'TYPE_B');
